package org.techtown.goodword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("이게 명언이야.?")
        sentenceList.add("하루에 3시간을 걸으면 7년 후에 지구를 한바퀴 돌 수 있다. -사무엘존슨")
        sentenceList.add("좋은 성과를 얻으려면 한 걸음 한 걸음이 힘차고 충실하지 않으면 안 된다, -단테")
        sentenceList.add("성공해서 만족하는 것은 아니다. 만족하고 있었기 때문에 성공한 것이다.-알랭")
        sentenceList.add("자신을 내보여라. 그러면 재능이 드러날 것이다. – 발타사르 그라시안")
        sentenceList.add("모든것들에는 나름의 경이로움과 심지어 어둠과 침묵이 있고 , 내가 어떤 상태에 있더라도 나는 그속에서 만족하는 법을 배운다 -헬렌켈러")
        sentenceList.add("작은 기회로 부터 종종 위대한 업적이 시작된다  -데모스테네스")
        sentenceList.add("삶을 사는 데는 단 두가지 방법이 있다. 하나는 기적이 전혀 없다고 여기는 것이고 또 다른 하나는 모든 것이 기적이라고 여기는방식이다. – 알베르트 아인슈타인")

        val sentenceadapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceadapter

    }
}