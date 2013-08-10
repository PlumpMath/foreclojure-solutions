(ns foreclojure-solutions.p29
  (:use midje.sweet))

(defn __ [x]
  (apply str (filter #(re-find #"[A-Z]" (str %)) (seq x))))

(fn [x]
  (apply str (filter #(re-find #"[A-Z]" (str %)) (seq x))))

(fact "Get the Caps"
  (__ "HeLlO, WoRlD!") => "HLOWRD"
  (empty? (__ "nothing")) => true
  (__ "$#A(*&987Zf") => "AZ")
