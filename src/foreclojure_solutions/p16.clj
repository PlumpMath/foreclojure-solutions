(ns foreclojure-solutions.p16
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Hello World"
  (__ "Dave") => "Hello, Dave!"
  (__ "Jenn") => "Hello, Jenn!"
  (__ "Rhea") => "Hello, Rhea!")
