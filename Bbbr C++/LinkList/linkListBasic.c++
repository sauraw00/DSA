#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;

    // constructor
    Node(int data)
    {
        this->data = data;
        this->next = NULL;
    }
   
     ~Node(){
    int value = this->data;
    //deletion
    if(this->next != NULL){
        delete next;
        this->next =NULL;
    }
    cout << "Memory free of" << value <<endl;
}

};


//add at end of node after null
void insertAtTail(Node *&tail , int d){
    //creating a new node
    Node * temp = new Node(d);
    tail->next = temp;
    tail = temp;


}
//add at starting of node
void insertionAtHead(Node *&head, int d)
{
    // creating a new node
    Node *temp = new Node(d);
    temp->next = head;
    head = temp;
};

void insertAtMiddle(Node *&head , Node*&tail , int pos, int d){

if(pos==1){
    insertionAtHead(head,d);
    return;
}
Node* temp = head;
int cnt =1;
while(cnt < pos-1){
    temp=temp->next;
    cnt++;

}
if(temp->next==NULL){
    insertAtTail(tail,d);
    return;
}
    Node* middleNode = new Node(d);
    middleNode->next = temp->next;
    temp->next = middleNode;

    

}

void deletion( int position,Node* & head, Node* &tail){
    
    // first node delete


    if (position==1){
        Node* temp = head;
        head->next = head;
        temp = NULL;
        delete temp;


    }
    else
    {
        // middle node or last node delete
        Node* prev = NULL;
        Node* curr = head;
        int cnt =1;

        while(cnt < position){
            prev = curr;
            curr = curr->next;
            cnt++;
        }

        prev->next = curr->next;
        curr= NULL;
        delete curr;
        
       
     

        

        
    }
    
}

void print(Node *&head)
{
    Node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data << "->";
        temp = temp->next;
    }
    cout << endl;
};

int main()
{
    Node *node1 = new Node(10);
    // cout << node1->data << endl;
    // cout << node1->next << endl;

    Node *head = node1;
    Node *tail = node1;

    print(head);
    insertAtTail(tail, 12); 
    print(head);
    insertAtTail(tail, 15); 
    print(head);

    insertAtMiddle(head, tail, 4, 33);
    print(head);

    deletion(4,head , tail);
    print(head);

    cout<< "tail->" << tail->data<< endl;

    return 0;
}