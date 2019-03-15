package com.practice.singleton;

public class Depot {
    private static final String TAG = Depot.class.getSimpleName();

    private static class DepotCreator {
        private static Depot sDepot = new Depot();
    }

    private Depot() {
    }

    public static Depot getInstance() {
        return DepotCreator.sDepot;
    }

/*調用過程說明：
1. 外部調用類的newInstance()
2. 自動調用Singleton2.ourInstance
2.1 此時單例類Singleton2得到初始化
2.2 而該類在裝載 & 被初始化時，會初始化它的靜態域，從而創建單例；
2.3 由於是靜態域，因此只會JVM只會加載1遍，Java虛擬機保證了線程安全性
3. 最終只創建1個單例*/
}
