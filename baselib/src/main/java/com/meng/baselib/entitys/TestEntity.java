package com.meng.baselib.entitys;

/**
 * Created by LiChaoBo on 2017/9/13.
 */

public class TestEntity {
    /**
     * author : 叔本华
     * content : <p>每做一件事，我们首先想到的就是别人会怎样看，人生中几乎有一半的麻烦与困扰就是来自于我们对行动结果的焦虑上。这种焦虑来源于自尊心，人们对它也因日久麻痹而没有了感觉。我们的弄虚作假以及装模作样都是源于担心别人会怎么说的焦虑上。如果没有了这种焦虑，奢求也就无从谈及了。</p><p>各种形式的骄傲，不论表面上多么不同，骨子里都有这种担心别人会怎么说的焦虑，然而这种忧虑所付出的代价又是多么的大啊！</p><p>因为，当一个人年华老去，没有能力来享受各种感官之乐时，除了贪婪，虚荣和骄傲就是他唯一的拥有了。</p><p>要知道幸福是存在于心灵的平和及满足中的。所以，要得到幸福就必须合理地限制这种担心别人会怎么说的本能冲动，我们要将4/5的分量切除掉，这样才能拔去身上那根常令我们痛苦的剌。当然要做到这一点是很困难的，因为此类冲动是人性内自然的执拗。</p><p>制止这种普遍愚昧的唯一方法就是认清这是一种愚昧，一个人若完全知道了别人对自己的评价，那他会烦死的。最后我们清楚地知道，与其他许多事比较，荣誉对我们的生活来说并没有直接的价值，而只有间接的价值。如果人们果能从这个愚昧的想法中挣脱出来，他就可以获得现在所不能想象的平和与快乐：他面对世界时会更坚定、更自信、不必再拘谨不安了。</p><p>换句话说，我们能够“归返到本性”上的生活了。同时我们也可以避免许多厄运，这些厄运是由于我们现在只追寻别人的意见而造成的。由于我们的愚昧造成的厄运只有当我们不再在意这些不可捉摸的阴影，并注意真实时才能避免，这样我们在享受美好的真实时才不会遇到阻碍。但是，别忘了：值得做的事都是难做的事。</p>
     * date : {"curr":"20170913","next":"20170914","prev":"20170912"}
     * digest : 每做一件事，我们首先想到的就是别人会怎样看，人生中几乎有一半的麻烦与困扰就是来自于我们对行动结果的焦虑上。这种焦虑来源于自尊心，人们对它也因
     * title : 本性的回归
     * wc : 652
     */

    private String author;
    private String content;
    private DateBean date;
    private String digest;
    private String title;
    private int wc;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(DateBean date) {
        this.date = date;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWc(int wc) {
        this.wc = wc;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public DateBean getDate() {
        return date;
    }

    public String getDigest() {
        return digest;
    }

    public String getTitle() {
        return title;
    }

    public int getWc() {
        return wc;
    }

    public static class DateBean {
        /**
         * curr : 20170913
         * next : 20170914
         * prev : 20170912
         */

        private String curr;
        private String next;
        private String prev;

        public void setCurr(String curr) {
            this.curr = curr;
        }

        public void setNext(String next) {
            this.next = next;
        }

        public void setPrev(String prev) {
            this.prev = prev;
        }

        public String getCurr() {
            return curr;
        }

        public String getNext() {
            return next;
        }

        public String getPrev() {
            return prev;
        }
    }
}
