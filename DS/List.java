import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;


class List{

    int maxSize = 100;
    int length = 0;
    Object[] data;
    
    public List(int maxSize){
        this.maxSize = maxSize;
        length = 0;
        data = new Object[maxSize];
    }

    public void add(Object element){
        if(length == maxSize){
            System.arraycopy(data, 0, data, 0, maxSize * 2);
            maxSize = maxSize * 2;
        }
        
        data[length] = element;
        length++;
    }

    public boolean delete(int index){
        if(index >= maxSize || index > length || length == 0){
            return false;
        }

        for(int j = index;j < length;j++){
            data[j] = data[j+1];
        }
        length--;
        return true;
    }

    public Object get(int index){
        return data[index];
    }
}



