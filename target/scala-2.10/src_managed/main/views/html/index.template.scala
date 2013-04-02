
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Article],Form[scala.Tuple3[String, String, Option[String]]],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(articles: List[Article], articleForm: Form[(String, String, Option[String])]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("My blog")/*5.17*/ {_display_(Seq[Any](format.raw/*5.19*/("""

	<h1>"""),_display_(Seq[Any](/*7.7*/articles/*7.15*/.size)),format.raw/*7.20*/(""" blog post(s)</h1>
	
	<ul style="list-style-type:none" >
		"""),_display_(Seq[Any](/*10.4*/articles/*10.12*/.map/*10.16*/ { article =>_display_(Seq[Any](format.raw/*10.29*/("""
			<li>
			<div>
				<span>
				<h3>
				<a href=""""),_display_(Seq[Any](/*15.15*/article/*15.22*/.getLink)),format.raw/*15.30*/("""">"""),_display_(Seq[Any](/*15.33*/article/*15.40*/.title)),format.raw/*15.46*/("""</a>
				</h3>
				By """),_display_(Seq[Any](/*17.9*/article/*17.16*/.author)),format.raw/*17.23*/("""
				</span>
				<div style="background:#AAAAAA">
				"""),_display_(Seq[Any](/*20.6*/article/*20.13*/.content)),format.raw/*20.21*/("""
				</div>
				<span>
				"""),_display_(Seq[Any](/*23.6*/form(routes.Application.deleteArticle(article.id))/*23.56*/ {_display_(Seq[Any](format.raw/*23.58*/("""
					<input type="submit" value="Delete">
				""")))})),format.raw/*25.6*/("""
				</span>
				</div>
			</li>
		""")))})),format.raw/*29.4*/("""
	</ul>
	
	<h2>Add a new blog post</h2>
	
	"""),_display_(Seq[Any](/*34.3*/form(routes.Application.newArticle)/*34.38*/ {_display_(Seq[Any](format.raw/*34.40*/("""
		"""),_display_(Seq[Any](/*35.4*/inputText(articleForm("title")))),format.raw/*35.35*/("""
		"""),_display_(Seq[Any](/*36.4*/inputText(articleForm("author")))),format.raw/*36.36*/("""
		"""),_display_(Seq[Any](/*37.4*/inputText(articleForm("content")))),format.raw/*37.37*/("""
		
		<input type="submit" value="Create">
		
	""")))})),format.raw/*41.3*/("""
""")))})))}
    }
    
    def render(articles:List[Article],articleForm:Form[scala.Tuple3[String, String, Option[String]]]): play.api.templates.Html = apply(articles,articleForm)
    
    def f:((List[Article],Form[scala.Tuple3[String, String, Option[String]]]) => play.api.templates.Html) = (articles,articleForm) => apply(articles,articleForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 01 23:56:57 PDT 2013
                    SOURCE: C:/Users/vinay/play-blog/app/views/index.scala.html
                    HASH: a46eb8d358ea21fe1b84d6f3c1f47854f6663601
                    MATRIX: 563->1|735->79|765->101|802->104|825->119|864->121|908->131|924->139|950->144|1048->207|1065->215|1078->219|1129->232|1222->289|1238->296|1268->304|1307->307|1323->314|1351->320|1411->345|1427->352|1456->359|1549->417|1565->424|1595->432|1661->463|1720->513|1760->515|1841->565|1912->605|1996->654|2040->689|2080->691|2120->696|2173->727|2213->732|2267->764|2307->769|2362->802|2445->854
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|28->7|28->7|28->7|31->10|31->10|31->10|31->10|36->15|36->15|36->15|36->15|36->15|36->15|38->17|38->17|38->17|41->20|41->20|41->20|44->23|44->23|44->23|46->25|50->29|55->34|55->34|55->34|56->35|56->35|57->36|57->36|58->37|58->37|62->41
                    -- GENERATED --
                */
            