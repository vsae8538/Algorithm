#include <stdio.h>
#include <stdlib.h>

#define InitSize 10

typedef struct {
    int *data;
    int MaxSize;
    int length;
} SeqList;

void InitList(SeqList &L){
    L.data = (int *)malloc(sizeof(int) * InitSize);
    L.length=0;
    L.MaxSize=InitSize;
}

void IncreaseSize(SeqList &L, int len){
    int *p = L.data;
    L.data = (int *)malloc(sizeof(int)*(L.MaxSize+len));
    for(int i = 0;i < L.length;i++){
        L.data[i] = p[i];
    }
    L.MaxSize=L.MaxSize+len;
    free(p);
}

bool ListInsert(SeqList &L, int i, int e){
    if(i < 0 || i > L.length+1){
        return false;
    }
    if(L.length >= InitSize){
        return false;
    }

    if(L.length == 0){
        L.data[0] = e;
    }else{
        for(int j = L.length;j >= i;j--){
            L.data[j] = L.data[j-1];
        }
        L.data[i-1] = e;
    }

    L.length++;
    return true;
}

bool ListDelete(SeqList &L, int i, int &e){
    if(i < 0 || i > L.length){
        return false;
    }
    e = L.data[i-1];
    for(int j = i;j < L.length;j++){
        L.data[j-1] = L.data[j];
    }
    L.length--;
    return true;
}

int main(int argc, char const *argv[])
{
    SeqList L;
    InitList(L);
    //IncreaseSize(L, 5);

    for(int i = 0;i <= 9;i++){
        if(!ListInsert(L, i, i)){
            printf("insert failed.\n");
            return 0;
        }
    }


    int e = -1;
    if(ListDelete(L, 3, e)){
        printf("Delete Eelement is :%d\n", e);
    }else{
        printf("index failed\n");
    }

    return 0;
}


