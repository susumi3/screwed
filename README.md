# Screwedにようこそ [![Java Build](https://github.com/suzumiya-3/screwed/actions/workflows/screwed.yaml/badge.svg)](https://github.com/suzumiya-3/screwed/actions/workflows/screwed.yaml)
Screwedは、Java上で動くパスワード生成ツールです。

Screwedを起動させる場合は、_Java Runtime Environment (JRE)_ 、ビルド済みjarを使用する場合、_Java 8_ 以上が必要となります。<br />
まずはScrewed本体のダウンロードから始めましょう。
<br />
### 1. Screwedのダウンロード
  Screwed本体のダウンロードは[こちら](https://github.com/suzumiya-3/screwed/releases)からscrewed-..jarをクリックすることでできます。<br />
  これができましたら次に`ダウンロード`フォルダーから適当なフォルダーに移動させましょう。
<br />
### 2. Screwedの起動
  先ほどScrewedの移動先のフォルダーをエクスプローラで開き、<br />
  それからScrewedをダブルクリックで起動します。
<br />
### 3. Screwedの操作
  右側のメニューから設定ができます。<br />
  右上から順に、
  - `add upper`(= 大文字)
  - `add lower`(= 大文字)
  - `add number`(= 数字)
  - `symbols`(= 記号)
  - `passwords`(= パスワード数)
  と、なります。<br />
  最後に`Screwed!`を押すことでパスワード生成が生成されます。<br />

  生成されたパスワードはその場でコピーすることができますし、<br />
  同じ階層にpass.txtが生成されてパスワードが生成するたびに追加されていきます。
<br />
### 3.5. Screwedの操作 (CUI)
  Screwedではコマンドプロンプト上でも起動できます。<br />
  そして、引数を指定することで生成する数などが調整できます。<br />
  一例としてコマンドを提示します。<br />
  `java -jar screwed-1.0.jar -cui true true ture !\"#$%&'()=-~^/_<>+*@ 11 5`<br />
  最初の`true`から11はGUIと同じ意味ですが、5はパスワードを生成する数となっています。<br />
  また、生成されたパスワード一覧は`pass.txt`から見れます。
<br />

## その他

### _Java Runtime Environment (JRE)_ のインストール
  [こちら](https://www.java.com/ja/download/ie_manual.jsp)から`Javaのダウンロード`をクリックし、ダウンロードされた`jre-8u381-windows-x64.exe`を起動させます。<br />
  適当にボタンを押していき、インストールを完了させます。
<br />
### 更新予定
  インストーラーの作成<br />
<br />
  
