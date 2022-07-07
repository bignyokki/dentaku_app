class dentaku{
  public static void main(String[] args){
    // メイン関数（必ず実行される関数。プログラムの本文）
    // public : どこからでも参照可能
    // static : インスタンス化(=new)せずに使える。main関数は他のクラスから呼ばれるものではなく、それ自体を実行するもの
    // void : 戻り値なし
    // main : メソッド名
    // String[] args : コマンドライン引数。コマンドラインでプログラムを実行するときに「java プログラム名 引数1 引数2...」と引数を受け取る
    //                 String : 引数をString型の配列で受け取る。String型でなくてもいい。人間が入力する文字は文字列であるという思想から
    //                 args : 引数名。arguments（和訳：引数）の複数形の略省

    // 以下変数宣言
    int val1 = 0;  /* 最初の数字 */
    // int : 整数型
    int val2 = 0;  /* 次の数字 */
    String ope;    /* 演算子 */
    // String : 文字列型
    int kekka;     // 結果を確認

    // コマンドライン引数が３個以外の場合
    if (args.length != 3){
      // errDispメソッドを呼び出し
      errDisp("引数は3個入力して下さい");
    }

    // try-catch文。エラーが発生した時の処理を記述できる。エラーでプログラムが終了しない
    try {
      // try{} : 例外が発生する可能性のある処理を記述
      val1 = Integer.parseInt(args[0]); //コマンドライン引数を変数に代入
      val2 = Integer.parseInt(args[2]); // Integer.parseInt : 文字列を整数に変換
    } catch(NumberFormatException e){
      // catch(例外クラス e){} : 例外クラスのエラーが発生した時の処理を記述
      // NumberFormatException : 文字列を数値型に変換しようとしたとき、文字列の形式が正しくない場合
      errDisp("数値でない値が入力されています");
    }

    ope = args[1];

    // opeStr並列に演算子を格納
    String opeStr[] = {"kake", "waru", "tasu", "hiku"};
    // エラー判定用変数errFlag
    boolean errFlag = true; // boolean型 : true or false

    // 繰り返し文で引数が各演算子と合うか判定。あえばerrFlagをfalseに
    for (int i = 0 ; i < 4 ; i++) {
      if (ope.equals(opeStr[i])) {
        errFlag = false;
      }
    }

    // 引数が演算子のどれとも合わない(errFlag = true)場合
    if (errFlag == true) {
      errDisp("演算子は kake waru tasu hiku の4つです");
    }

    // 演算子によって計算を行う
    if (ope.equals("kake")){
      kekka = val1 * val2;
    }else if (ope.equals("tasu")){
      kekka = val1 + val2;
    }else if (ope.equals("hiku")){
      kekka = val1 - val2;
    }else{

      // 割り算の場合0で割れないので、0の場合終了する
      if (val2 == 0){
        errDisp("0 で割ろうとしました");
      }

      kekka = val1 / val2;
    }

    System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " です");
    System.out.println("計算結果は " + kekka + " です");
  }

  // エラーになる場合、内容(errStr)を表示してプログラムを終了する
  private static void errDisp(String errStr){
    System.out.println("Usage : java dentaku 数値 演算子 数値");
    System.out.println(errStr);
    System.exit(0);  /* プログラムを終了する */
  }

}