
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
object showArticle extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Article,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(article: Article):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Article")/*5.17*/ {_display_(Seq[Any](format.raw/*5.19*/("""
	<div>
				<span>
				<h3>
				"""),_display_(Seq[Any](/*9.6*/article/*9.13*/.title)),format.raw/*9.19*/("""
				</h3>
				By """),_display_(Seq[Any](/*11.9*/article/*11.16*/.author)),format.raw/*11.23*/("""
				</span>
				<div style="background:#AAAAAA">
				"""),_display_(Seq[Any](/*14.6*/article/*14.13*/.content)),format.raw/*14.21*/("""
				</div>
				<span>
				"""),_display_(Seq[Any](/*17.6*/form(routes.Application.deleteArticle(article.id))/*17.56*/ {_display_(Seq[Any](format.raw/*17.58*/("""
					<input type="submit" value="Delete">
				""")))})),format.raw/*19.6*/("""
				</span>
				</div>
""")))})))}
    }
    
    def render(article:Article): play.api.templates.Html = apply(article)
    
    def f:((Article) => play.api.templates.Html) = (article) => apply(article)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 01 23:14:47 PDT 2013
                    SOURCE: C:/Users/vinay/play-blog/app/views/showArticle.scala.html
                    HASH: 9c2aeef77347fb5141ca4b70c926876b647d1ddf
                    MATRIX: 512->1|624->19|654->41|691->44|714->59|753->61|824->98|839->105|866->111|922->132|938->139|967->146|1060->204|1076->211|1106->219|1172->250|1231->300|1271->302|1352->352
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|30->9|30->9|30->9|32->11|32->11|32->11|35->14|35->14|35->14|38->17|38->17|38->17|40->19
                    -- GENERATED --
                */
            