package models

import anorm._
import anorm.SqlParser._
import play.api.db._
import play.api.Play.current

case class Article(id: Long, title: String, author: String, content: String) {
  var this.id = id
  var this.title = title
  var this.author = author
  var this.content = content
  
  def getLink: String = {
    ("/articles/" + id).toString
  }
}

object Article {
  
  val article = get[Long]("id") ~ get[String]("title") ~ get[String]("author") ~ get[String]("content") map {
    case i~t~a~c => Article(i, t, a, c)
    }
  
  def all(): List[Article] = DB.withConnection {
    implicit c => SQL("select * from article").as(article *)
  }
  
  def create(title: String, author: String, content: String) {
    DB.withConnection { implicit c =>
      SQL("insert into article (title, author, content) values ({title}, {author}, {content})").on(
          'title -> title, 'author -> author, 'content -> content).executeUpdate()
    }
  }
  
  def delete(id: Long) {
    DB.withConnection { implicit c =>
      SQL("delete from article where id = {id}").on(
          'id -> id
          ).executeUpdate()
    }
  }
  
  def show(id: Long): Article = DB.withConnection { implicit c =>
      SQL("select * from article where id = {id}").on(
          'id -> id
          ).as(article.single)
  }
}