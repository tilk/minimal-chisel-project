import chisel3._

object Main extends App {
  val verilog = emitVerilog(new Counter(), args)
  println(verilog)
}

