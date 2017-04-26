package demo.zookeeper.remoting.common;
 
public interface Constant {
 
    String ZK_CONNECTION_STRING = "192.168.68.129:2181,192.168.68.130:2181,192.168.68.131:2181";
    int ZK_SESSION_TIMEOUT = 5000;
    String ZK_REGISTRY_PATH = "/registry";
    String ZK_PROVIDER_PATH = ZK_REGISTRY_PATH + "/provider";
}