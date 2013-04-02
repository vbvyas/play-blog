// @SOURCE:C:/Users/vinay/play-blog/conf/routes
// @HASH:4a5192c77783a0e690045ebe707dff5f88373738
// @DATE:Mon Apr 01 23:14:47 PDT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_articles1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("articles"))))
        

// @LINE:8
private[this] lazy val controllers_Application_newArticle2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("articles"))))
        

// @LINE:9
private[this] lazy val controllers_Application_deleteArticle3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("articles/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
        

// @LINE:10
private[this] lazy val controllers_Application_showArticle4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("articles/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:13
private[this] lazy val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """articles""","""controllers.Application.articles"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """articles""","""controllers.Application.newArticle"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """articles/$id<[^/]+>/delete""","""controllers.Application.deleteArticle(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """articles/$id<[^/]+>""","""controllers.Application.showArticle(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_articles1(params) => {
   call { 
        invokeHandler(controllers.Application.articles, HandlerDef(this, "controllers.Application", "articles", Nil,"GET", """""", Routes.prefix + """articles"""))
   }
}
        

// @LINE:8
case controllers_Application_newArticle2(params) => {
   call { 
        invokeHandler(controllers.Application.newArticle, HandlerDef(this, "controllers.Application", "newArticle", Nil,"POST", """""", Routes.prefix + """articles"""))
   }
}
        

// @LINE:9
case controllers_Application_deleteArticle3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteArticle(id), HandlerDef(this, "controllers.Application", "deleteArticle", Seq(classOf[Long]),"POST", """""", Routes.prefix + """articles/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:10
case controllers_Application_showArticle4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.showArticle(id), HandlerDef(this, "controllers.Application", "showArticle", Seq(classOf[Long]),"GET", """""", Routes.prefix + """articles/$id<[^/]+>"""))
   }
}
        

// @LINE:13
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        