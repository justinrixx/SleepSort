# SleepSort
A novelty sort that uses threads to get a sorted list

It's not efficient or anything, but cool. The idea is that for each number,
a new thread is created. The thread then sleeps for as long as the number is
miliseconds. When the thread wakes up, the number adds itself to the list.
So it takes advantage of the fact that bigger numbers sleep longer.

It's also not perfect (when you tell a Thread to sleep, it could sleep longer),
so sometimes 4 and 5 will swap places, for example.
