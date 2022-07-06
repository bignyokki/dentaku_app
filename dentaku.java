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

    if (args.length != 3){
      System.out.println("Usage : java dentaku 数値 演算子 数値");
      // System.out.println : コマンドラインへ出力
      System.out.println("演算子は kake waru tasu hiku の4つです");
      System.exit(0);  /* プログラムを終了する */
    }

    // 以下でコマンドライン引数を変数に代入
    val1 = Integer.parseInt(args[0]);
    // Integer.parseInt : 文字列を整数に変換
    val2 = Integer.parseInt(args[2]);
    ope = args[1];

    System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " です");
  }
}