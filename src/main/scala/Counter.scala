import chisel3._

class Counter extends Module {
  val io = IO(new Bundle {
    val en = Input(Bool())
    val out = Output(UInt(8.W))
  })
  val counter = RegInit(UInt(8.W), 0.U)
  counter := counter + io.en
  io.out := counter
}

