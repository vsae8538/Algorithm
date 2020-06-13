#include <stdio.h>
#include <stdlib.h>

void enqueue(int);
int dequeue(void);
void printQueue(void);

struct node{
    int data;
    struct node *next;
};
typedef struct node Node;

Node *front = NULL;
Node *rear = NULL;

int main(int argc, char *argv[]){
    enqueue(1);
    enqueue(2);
    enqueue(3);
    printQueue();
    dequeue();
    dequeue();
    printQueue();
    dequeue();
    printQueue();
    enqueue(1);
    printQueue();
    enqueue(2);
    printQueue();
    enqueue(3);
    printQueue();
    dequeue();
    dequeue();
    printQueue();
    dequeue();
    printQueue();
    return 0;
}

void enqueue(int data){
    Node *pt;
    pt = (Node*) malloc(sizeof(Node));
    if(pt == NULL){
        printf("oom\n");
        exit(1);
    }

    pt->data = data;
    pt->next = NULL;

    if(front == NULL){
        front = rear = pt;
    }else{
        rear->next = pt;
        rear = pt;
    }
}

int dequeue(){
    Node *pt = front;
    int res;
    if(front == NULL){
        printf("Queue is empty\n");
        return;
    }
    if(front->next == NULL){
        res = front->data;
        free(pt);
        front = NULL;
        rear = NULL;
        return res;
    }else{
        res = pt->data;
        front = front->next;
        free(pt);
        return res;
    }
}

void printQueue(){
    Node *pt = front;
    while(pt != NULL){
        printf("%d ", pt->data);
        pt = pt->next;
    }
    printf("\n");
}
