#include <iostream>
#include <algorithm>
using namespace std;
#define N 100010
int a[N];
int main() 
{
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    sort(a, a + n);
    int ans =0;
    for (int i = 0; i < n/2; i++)
    {
        ans = ans + a[n-i-1] - a[i];
    }
    cout << ans <<endl;
    
}