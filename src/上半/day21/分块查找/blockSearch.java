package 上半.day21.分块查找;

public class blockSearch {
    public static void main(String[] args) {
        /*分块查找核心思想:块内无序，块间有序
          实现步骤：1.创建数组blockArr存放每一个块对象的信息
                  2.先查找blockArr确定要查找的数据属于哪一块3.再单独遍历这一块数据即可*/


        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        //1.创建对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        //2.定义数组用来管理三个块的对象（索引表）
        //注意：数组中存放的数据为对象时，数据类型需要跟对象的数据类型统一
        Block[] blockArr = {b1, b2, b3};

        //3.定义一个变量用来记录需要查找的元素
        int number = 16;

        //4.调用方法，传递索引表，源数组，要查找的元素，进行查找
        int index = getIndex(blockArr, arr, number);

        //5.打印对应的索引
        System.out.println(index);

    }

    //利用分块查找的原理，查询要查找的元素的索引
    public static int getIndex(Block[] blockArr, int[] arr, int number) {
        //1.确定number在哪一块当中
        int indexBlock = findIndexBlock(blockArr, number);

        //2.对异常场景进行判断
        if (indexBlock == -1) {
            return -1;
        }
        //3.代码执行到这里表示要查找的元素在数组中，此时需要获取他的起始索引和结束索引
        //blockArr[indexBlock]表示：当前要查找的元素在数组的哪一个索引上，利用这个去获取对应数组的索引
        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        //4.遍历数组,开始条件和结束条件为当前number所在的数组的起始索引和结束索引
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    //定义一个方法，用来确定要查找的元素在哪一块当中
    public static int findIndexBlock(Block[] blockArr, int number) {
        //从0索引开始遍历blockArr，如果number小于max的值，那么就表示number是在这一块当中
        for (int i = 0; i < blockArr.length; i++) {
            //blockArr[i].getMax()表示：获取当前索引对应的数组中的最大值
            if (number <= blockArr[i].getMax()) {
                //符合条件则返回索引，表示当前需要查找的元素在这个索引所对应的数组中
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
