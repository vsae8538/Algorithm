#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *next;
};
typedef struct node Node;

Node* createNode(int data){
    Node *pt;
    pt = (Node*) malloc(sizeof(Node));
    if(pt == NULL){
        printf("oom");
        return 0;
    }
    pt->data = data;
    pt->next = NULL;
    return pt;
}

void deleteNode(Node *head, int data){
    Node *pt = head;
    Node *cur = pt;
    while(pt != NULL){
        if(pt->data == data){
            cur->next = pt->next;
            free(pt);
            return;
        }
        cur = pt;
        pt = pt->next;
    }
}

void printNodes(Node* head){
    Node *pt = head;
    while(pt != NULL){
        printf("%d ", pt->data);
        pt = pt->next;
    }
    printf("\n");
}


int main(int argc, char *argv[]){
    Node *list;
    list = createNode(10);
    Node *pt = list;
    for(int i = 2;i <= 5;i++){
        pt->next = createNode(i*10);
        pt = pt->next;
    }
    printNodes(list);
    deleteNode(list, 20);
    printNodes(list);
    return 0;
}