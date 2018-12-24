package context;

import store.KVStoreForLevelDB;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: simplePsForModelPartition
 * @description: 共同的context
 * @author: SongZhen
 * @create: 2018-12-17 20:55
 */
public class Context {


    /** 网络通信server的相关配置*/
    public static Map<Integer,String> serverIp= new HashMap<Integer, String>();
    public static Map<Integer,Integer> serverPort= new HashMap<Integer, Integer>();


    /** 稀疏维度大小*/
    public static long sparseDimSize;
    public static int featureSize;

    /** 是否是分布式执行*/
    public static boolean isDist;

    /** 是否初始化完毕*/
    public static boolean inited=false;

    /** worker和server数量*/
    public static int workerNum;
    public static int serverNum;

    /** 数据集划分*/
    public static int partitionedDataSize;
    public static int dataPartitionNum;

    /** 判断是不是server的master机器，管参数分配的*/
    public static int masterId;



    public static void init() throws IOException {
        if(inited==true){
            return;
        }

        serverIp.put(0,"202.199.6.30");
        serverIp.put(1,"202.199.6.30");
        serverIp.put(2,"202.199.6.30");
        serverPort.put(0,9010);
        serverPort.put(1,9011);
        serverPort.put(2,9012);

        featureSize=10;




        isDist=true;

        // 当worker和server数量都是1，则为单机运行，masterId设置为0
        workerNum=1;
        serverNum=1;
        dataPartitionNum=workerNum;
        partitionedDataSize=100000;
        masterId=0;



        inited=true;
    }
}