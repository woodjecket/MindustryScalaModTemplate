package example

import arc._
import mindustry._
import mindustry.content._
import mindustry.game.EventType._
import mindustry.mod._
import mindustry.ui.dialogs._

class ExampleScalaMod() extends Mod(){
        ScalaLog.info("Loaded ExampleScalaMod constructor.")
    override def loadContent(): Unit = {
        ScalaLog.info("Loading some example content.")
    }
}