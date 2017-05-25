import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.mllib.random.RandomRDDs._
/**
  * Created by TomHuang on 2017/5/25.
  */
object Main  extends App{

  val conf = new SparkConf().setMaster("local").setAppName("automaticShard")
  val sc = new SparkContext(conf)

  val randomNum = normalRDD(sc, 100)
  randomNum.foreach(println)

}
