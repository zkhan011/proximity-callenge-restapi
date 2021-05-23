# proximity-callenge-restapi
This is a Rest API built with spring boot + jpa + mysql + jwt , for a course management system
Problem Statement
Rest API where an instructor and student manage their Webinars & Courses. A Creator can create course, subjects, tags and they can upload videos and webinars to the system. Lessons & webinars can be present in multiple courses and subjects. A Student can then search for webinars and/or videos using webinar title, video title, course name and subject name, and can filter using course, subjects and tags. Build the application keeping in mind that data duplicacy and time complexity should be minimized.

User Stories
As an instructor, I can upload a webinar.
As an instructor, I can create, edit, delete course.
As an instructor, I can create, edit, delete subjects.
As an instructor, I can create, edit, delete tags.
As an instructor, I can upload a video.
As an instructor, I can add new tag while uploading video or webinar.
As an instructor, I can see the most viewed videos, courses and webinars.
As a student, I can see list of webinars & videos.
As a student, I can search webinars & videos by title.
As a student, I can filter webinars & videos by course, subjects, tags.
As a student, when I am playing a video or a webinar, I can get personalized suggestions of courses/webinars.

Technologies Used:
Java 8 
Hibernate
Spring boot
Spring Security
JWT based authentication and authorization
MYSQl
Amazon S3 for file upload.



