// @SOURCE:C:/Users/vinay/play-blog/conf/routes
// @HASH:4a5192c77783a0e690045ebe707dff5f88373738
// @DATE:Mon Apr 01 23:14:47 PDT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def articles(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "articles")
}
                                                

// @LINE:10
def showArticle(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:8
def newArticle(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "articles")
}
                                                

// @LINE:9
def deleteArticle(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def articles : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.articles",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles"})
      }
   """
)
                        

// @LINE:10
def showArticle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showArticle",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:8
def newArticle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newArticle",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "articles"})
      }
   """
)
                        

// @LINE:9
def deleteArticle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteArticle",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def articles(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.articles(), HandlerDef(this, "controllers.Application", "articles", Seq(), "GET", """""", _prefix + """articles""")
)
                      

// @LINE:10
def showArticle(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showArticle(id), HandlerDef(this, "controllers.Application", "showArticle", Seq(classOf[Long]), "GET", """""", _prefix + """articles/$id<[^/]+>""")
)
                      

// @LINE:8
def newArticle(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newArticle(), HandlerDef(this, "controllers.Application", "newArticle", Seq(), "POST", """""", _prefix + """articles""")
)
                      

// @LINE:9
def deleteArticle(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteArticle(id), HandlerDef(this, "controllers.Application", "deleteArticle", Seq(classOf[Long]), "POST", """""", _prefix + """articles/$id<[^/]+>/delete""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      