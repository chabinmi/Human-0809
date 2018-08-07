import android.util.Log;

class Human2 extends Animal implements Thinkable {

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }
}
