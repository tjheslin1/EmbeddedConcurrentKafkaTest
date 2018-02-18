import org.scalatest.{Matchers, WordSpec}
import net.manub.embeddedkafka.EmbeddedKafka._

class ConcurrentKafkaSpec extends WordSpec with Matchers{

  "EmbeddedKafka" should {
    "first test" in {
      withRunningKafka {


      }
    }
  }
}
