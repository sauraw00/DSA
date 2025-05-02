#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *prev;
    Node *next;

    // constructor
    Node(int d)
    {
        this->data = d;
        this->next = NULL; // in initial state
        this->prev = NULL; // in initial state
    }
    //destructor>>>>>>>

    ~Node(){
        int val =this->data;
        if(this->next != NULL){
        delete next;   
        this->next = NULL;

        }
        cout<< "memory free"<< val<<endl;
    }
};

// insert at tail
void insertAtTail(Node *&head, Node *&tail, int d)
{
    if (tail == NULL)
    {
        Node *temp = new Node(d);
        head = temp;
        tail = temp;
    }
    else
    {
        Node *temp = new Node(d);
        tail->next = temp;
        temp->prev = tail;
        tail = temp;
    }
};
// insert at head
void insertAthead(Node *&head, Node *&tail ,int d)
{

    if (head == NULL)
    {
        Node *temp = new Node(d);
        head = temp;
        tail = temp;
    }
    else
    {
        Node *temp = new Node(d);
        temp->next = head;
        head->prev = temp;
        head = temp;
    }
};
// traverse a linklist

void print(Node *head)
{
    Node *temp = head;
    while (temp != NULL)
    {

        cout << temp->data << "->";
        temp = temp->next;
    }
    cout << endl;
};

// length of a link list
int getLength(Node *head)
{
    int len = 0;
    Node *temp = head;
    while (temp != NULL)
    {
        len++;
        temp = temp->next;
    }
    return len;
};
// insert anywhere in LL
void insertAnyWhere(Node *&head, Node *&tail, int pos, int d)
{
    if (pos == 1)
    {
        insertAthead(head,tail, d);
        return;
    }
    Node *temp = head;
    int cnt = 0;
    while (cnt < pos - 1)
    {
        temp = temp->next;

        cnt++;
    }
    if (temp->next == NULL)
    {
        insertAtTail(head, tail, d);
        return;
    }

    Node *nodeTOInsert = new Node(d);
    nodeTOInsert->next = temp->next;
    temp->next->prev = nodeTOInsert;
    temp->next = nodeTOInsert;
    nodeTOInsert->prev = temp;
};

void deleteNode(Node* &head,int pos){
    if(pos==1){
        Node* temp= head;
        temp->next->prev = NULL;
        head= temp->next;
        temp->next =NULL;
        delete temp;
    }
   else{
     int cnt =1;
    Node* curr = head;   
    Node* prev = NULL;

    while (cnt<pos)
    {
       prev= curr;
       curr = curr->next;
       cnt++;
    }
    
    curr->prev =NULL;
    prev->next = curr->next;
    curr->next =NULL;

    delete curr;


   }
}
int main()
{

    Node *head = NULL;
    Node *tail = NULL;
    
    // cout << getLength(head);
    insertAthead(head,tail, 13);
    print(head);
    insertAthead(head,tail, 68);
    print(head);
    insertAthead(head,tail, 1);
    print(head);

    insertAtTail(head,tail, 45);
    print(head);
    insertAnyWhere(head, tail, 3, 125);
    print(head);

    insertAnyWhere(head, tail, 5, 125);
    print(head);

    deleteNode(head,1);
    print(head);
    
    return 0;
}
