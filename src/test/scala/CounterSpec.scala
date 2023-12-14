import chisel3._
import chiseltest._
import org.scalatest._
import flatspec._

class CounterSpec extends AnyFlatSpec with ChiselScalatestTester {
  behavior of "Counter"

  it should "increment when en is high" in {
    test(new Counter()).withAnnotations(
      Seq(WriteVcdAnnotation)
    ) { c =>
      c.io.en.poke(false)
      c.io.out.expect(0.U)
      c.clock.step()
      c.io.out.expect(0.U)
      c.io.en.poke(true)
      c.clock.step()
      c.io.out.expect(1.U)
    }
  }
}
