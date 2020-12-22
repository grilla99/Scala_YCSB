package redis

class RedisClient {

  val HOST_PROPERTY = "redis.host"
  val PORT_PROPERTY = "redis.port"
  val PASSWORD_PROPERTY =  "redis.password"
  val CLUSTER_PROPERTY = "redis.cluster"
  val TIMEOUT_PROPERTY = "redis.timeout"

  val INDEX_KEY = "_indices"

//  @throws(classOf[Java])  NEED TO ADD IN TRHOWS A DB Exception
  def init(): Unit = {
    
  }


}
