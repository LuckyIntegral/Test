insert into authors values (1, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Christian', 'Bauer');
insert into authors values (2, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Gavin', 'King');
insert into authors values (3, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Gary', 'Gregory');
insert into authors values (4, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Bruce', 'Eckel');
insert into authors values (5, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Brian', 'Goetz');
insert into authors values (6, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Tim', 'Peierls');
insert into authors values (7, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Joshua', 'Bloch');
insert into authors values (8, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Joseph', 'Bowbeer');
insert into authors values (9, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'David', 'Holmes');
insert into authors values (10, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Doug', 'Lea');
insert into authors values (11, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Raoul-Gabriel', 'Urma');
insert into authors values (12, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Mario', 'Fusco');
insert into authors values (13, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Alan', 'Mycroft');
insert into authors values (14, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Scott', 'Oaks');

insert into publishers values (1, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'US', 'Manning Publications Co.');
insert into publishers values (2, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'US', 'Prentice Hall');
insert into publishers values (3, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'US', 'Addison-Wesley Professional');
insert into publishers values (4, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'US', 'O''Reilly Media');

insert into books values (1, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Java Persistence with Hibernate. 2-end edition', 'Java Persistence with Hibernate, Second Edition explores Hibernate by developing an application that ties together hundreds of individual examples. In this revised edition, authors Christian Bauer, Gavin King, and Gary Gregory cover Hibernate 5 in detail with the Java Persistence 2.1 standard (JSR 338). All examples have been updated for the latest Hibernate and Java EE specification versions.
About the Technology
Purchase of the print book includes a free eBook in PDF, Kindle, and ePub formats from Manning Publications.
Persistence—the ability of data to outlive an instance of a program—is central to modern applications. Hibernate, the most popular Java persistence tool, offers automatic and transparent object/relational mapping, making it a snap to work with SQL databases in Java applications.
Christian Bauer is a member of the Hibernate developer team and a trainer and consultant. Gavin King is the founder of the Hibernate project and a member of the Java Persistence expert group (JSR 220). Gary Gregory is a principal software engineer working on application servers and legacy integration.', 'https://balka-book.com/files/2021/05_03/21_33/u_files_store_1_487055.jpg', 580, 00.00, 2016, 0, 1);

insert into books values (2, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Thinking in Java (4th Edition)', '“Thinking in Java should be read cover to cover by every Java programmer, then kept close at hand for frequent reference. The exercises are challenging, and the chapter on Collections is superb! Not only did this book help me to pass the Sun Certified Java Programmer exam; it’s also the first book I turn to whenever I have a Java question.”
    Live seminars, consulting, and reviews available. See www.MindView.net', 'https://balka-book.com/files/2021/05_03/21_34/u_files_store_1_490060.jpg', 1150, 00.00, 2006, 0, 2);

insert into books values (3, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Java Concurrency in Practice', '"I was fortunate indeed to have worked with a fantastic team on the design and implementation of the concurrency features added to the Java platform in Java 5.0 and Java 6. Now this same team provides the best explanation yet of these new features, and of concurrency in general. Concurrency is no longer a subject for advanced users only. Every Java developer should read this book."
"For the past 30 years, computer performance has been driven by Moore''s Law; from now on, it will be driven by Amdahl''s Law. Writing code that effectively exploits multiple processors can be very challenging. Java Concurrency in Practice provides you with the concepts and techniques needed to write safe and scalable Java programs for today''s--and tomorrow''s--systems."
Advanced topics such as atomic variables, nonblocking algorithms, and the Java Memory Model', 'https://balka-book.com/files/2021/05_03/21_28/u_files_store_1_472075.jpg', 384, 00.00, 2006, 0, 3);

insert into books values (4, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Effective Java. 3rd Edition', 'The Definitive Guide to Java Platform Best Practices—Updated for Java 9
Java has changed dramatically since the previous edition of Effective Java was published shortly after the release of Java 6. This Jolt award-winning classic has now been thoroughly updated to take full advantage of the latest language and library features. The support in modern Java for multiple paradigms increases the need for specific best-practices advice, and this book delivers.
As in previous editions, each chapter of Effective Java, Third Edition, consists of several “items,” each presented in the form of a short, stand-alone essay that provides specific advice, insight into Java platform subtleties, and updated code examples. The comprehensive descriptions and explanations for each item illuminate what to do, what not to do, and why.
Joshua Bloch is a professor at Carnegie Mellon University. He was formerly the chief Java architect at Google, a distinguished engineer at Sun Microsystems, and a senior systems designer at Transarc. He led the design and implementation of numerous Java platform features, including the JDK 5.0 language enhancements and the Java Collections Framework. He holds a Ph.D. in computer science from Carnegie Mellon University and a B.S. in computer science from Columbia University.', 'https://balka-book.com/files/2021/05_03/21_27/u_files_store_1_468120.jpg', 392, 00.00, 2018, 0, 3);

insert into books values (5, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Java 8 in Action. Lambdas, Streams, and functional-style programming', 'Summary
Java 8 in Action is a clearly written guide to the new features of Java 8. The book covers lambdas, streams, and functional-style programming. With Java 8''s functional features you can now write more concise code in less time, and also automatically benefit from multicore architectures. It''s time to dig in!
Purchase of the print book includes a free eBook in PDF, Kindle, and ePub formats from Manning Publications.
Mario Fusco is an engineer at Red Hat and creator of the lambdaj library. Alan Mycroft is a professor at Cambridge and cofounder of the Raspberry Pi Foundation.', 'https://balka-book.com/files/2021/05_03/21_28/u_files_store_1_472037.jpg', 394, 00.00, 2015, 0, 1);

insert into books values (6, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Java Performance: In-Depth Advice for Tuning and Programming Java 8, 11, and Beyond 2nd Edition', 'Coding and testing are generally considered separate areas of expertise. In this practical book, Java expert Scott Oaks takes the approach that anyone who works with Java should be equally adept at understanding how code behaves in the Java Virtual Machine—including the tunings likely to help performance. This updated second edition helps you gain in-depth knowledge of Java application performance using both the JVM and the Java platform.
Scott Oaks is an architect at Oracle Corporation, where he works on the performance of Oracle’s middleware software. Prior to joining Oracle, he worked for years at Sun Microsystems, specializing in many disparate technologies from the SunOS kernel to network programming and RPCs to windows systems and the OPEN LOOK Virtual Window Manager. In 1996, Scott became a Java evangelist for Sun and in 2001 joined their Java Performance group--which has been his primary focus ever since. Scott also authored O’Reilly’s Java Security, Java Threads, JXTA in a Nutshell, and Jini in a Nutshell titles.', 'https://balka-book.com/files/2021/05_03/21_54/u_files_store_1_559706.jpg', 450, 00.00, 2020, 0, 4);

insert into books values (7, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Java Performance: The Definitive Guide: Getting the Most Out of Your Code 1st Edition', 'Coding and testing are often considered separate areas of expertise. In this comprehensive guide, author and Java expert Scott Oaks takes the approach that anyone who works with Java should be equally adept at understanding how code behaves in the JVM, as well as the tunings likely to help its performance.
    Improve Java-driven database application performance', 'https://balka-book.com/files/2021/05_03/21_42/u_files_store_1_517038.jpg', 426, 00.00, 2014, 0, 4);

insert into book_author values (1, 1);
insert into book_author values (2, 1);
insert into book_author values (3, 1);
insert into book_author values (4, 2);
insert into book_author values (5, 3);
insert into book_author values (6, 3);
insert into book_author values (7, 3);
insert into book_author values (8, 3);
insert into book_author values (9, 3);
insert into book_author values (10, 3);
insert into book_author values (7, 4);
insert into book_author values (11, 5);
insert into book_author values (12, 5);
insert into book_author values (13, 5);
insert into book_author values (14, 6);
insert into book_author values (14, 7);
