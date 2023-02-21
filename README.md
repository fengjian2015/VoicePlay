
## LuckVoice 介绍

LuckVoice 内部采用soundPool按顺序播放本地mp3资源文件
目前所支持的部分汉字/数字/字母 参考类 VoiceCons

## 使用

VoicePlay.with(this).play(ArrayList<String> s, boolean haveMoney);
或者
VoicePlay.with(this).play(String s, boolean haveMoney);

String与ArrayList区别String需要复杂轮询匹配


