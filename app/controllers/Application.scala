package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.Article

object Application extends Controller {
  
  def index = Action {
    Redirect(routes.Application.articles)
  }
  
  def articles = Action {
    Ok(views.html.index(Article.all(), articleForm))
  }
  
  def newArticle = Action { implicit request =>
    articleForm.bindFromRequest.fold(
        errors => BadRequest(views.html.index(Article.all(), errors)),
        articleForm => {
          Article.create(articleForm._1, articleForm._2, articleForm._3.toString())
          Redirect(routes.Application.articles)
        }
    )
    
  }
  
  def deleteArticle(id: Long) = Action {
    Article.delete(id)
    Redirect(routes.Application.articles)
  }
  
  def showArticle(id: Long) = Action {
    Ok(views.html.showArticle(Article.show(id)))
  }
  
  val articleForm = Form(
    tuple(
	    "title" -> nonEmptyText,
	    "author" -> nonEmptyText,
	    "content" -> optional(text)
    )
  )
}