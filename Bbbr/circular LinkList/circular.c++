#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;

    // constructor
    Node(int d)
    {
        this->data = d;
        this->next = NULL;
    }
    // destructor

    ~Node()
    {
        int val = this->data;
        if (this->next != NULL)
        {
            delete next;
            this->next = NULL;
        }
        cout << "memory free" << val << endl;
    }
};

void
insertNewNode(Node *tail, int element, int d)
{
    // if there no node wants to add first node
  
    if (tail == NULL)
    {
        Node* newNode = new Node(d);
        tail = newNode;
        newNode->next = newNode;
    }
    else
    {
        Node* curr = tail;

        while (curr->data != element)
        {
            curr = curr->next;
        }

        // element found now insert newNode
        Node *temp = new Node(d);
       temp->next  = curr->next ;
        curr->next = temp;
    }
}
 void display(Node* tail){
    Node* temp = tail;

    do
    {
        cout<< temp->data<< " ";
        tail = tail->next;
    } while (tail != temp);
    cout << endl;
    
 }

int main()
{
    Node* tail = NULL;
    insertNewNode(tail,5,3);
    display(tail);

    return 0;
}