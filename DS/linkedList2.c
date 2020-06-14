#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *rNode;
    struct node *lNode;
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
    pt->rNode = NULL;
    pt->lNode = NULL;
    return pt;
}

void printNodes(Node* head){
    Node *pt = head;
    while(pt != NULL){
        printf("%d ", pt->data);
        pt = pt->rNode;
    }
    printf("\n");
}

int main(int argc, char *argv[]){
    Node *list;
    list = createNode(10);
    Node *pt = list;
    for(int i = 2;i <= 5;i++){
        pt->rNode = createNode(i*10);
        Node *tmp = pt;
        pt = pt->rNode;
        pt->lNode = tmp;
    }
    printNodes(list);
    return 0;
}
