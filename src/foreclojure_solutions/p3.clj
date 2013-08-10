(ns foreclojure-solutions.p3
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Intro to Strings"
  __ => (.toUpperCase "hello world"))
