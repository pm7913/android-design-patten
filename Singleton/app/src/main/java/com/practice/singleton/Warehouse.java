package com.practice.singleton;

public class Warehouse {
    private static final String TAG = Warehouse.class.getSimpleName();

    private static Warehouse sWarehouse;

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        //加入雙重校驗鎖
        //第一個
        if (sWarehouse == null) { // ①
            synchronized (Warehouse.class) {  // ②
                //第二個
                if (sWarehouse == null) {
                    sWarehouse = new Warehouse();
                }
            }
        }
        return sWarehouse;
    }

/*
    說明
    校驗鎖1：第1個if
    作用：若單例已創建，則直接返回已創建的單例，無需再執行加鎖操作
    即直接跳到執行返回ourInstance

    校驗鎖2：第2個if
    作用：防止多次創建單例問題
    原理
    1.線程A調用getInstance（），當運行到②位置時，此時線程B也調用了getInstance（）
    2.因線程A並沒有執行實例= new Singleton（）;,此時實例仍為空，因此線程B能突破第1層if判斷，
    運行到①位置等待synchronized中的A線程執行完畢
    3.當線程A釋放同步鎖時，單例已創建，即實例已非空
    4.此時線程B從①開始執行到位置②。此時第2層if判斷=null（單例已創建），因此也不會創建多餘的實例
*/



}
