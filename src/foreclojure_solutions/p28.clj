(ns foreclojure-solutions.p28
  (:use midje.sweet))

(comment 
  (defn flatty [x]
    "Flattens a sequence"
    [let elem (first x)
     result []]
    (if (not (coll?) elem)
      (concat elem r))
    (recurr (c))
    ))

(future-fact "Flatten a Sequence"
  (__ '((1 2) 3 [4 [5 6]])) => '(1 2 3 4 5 6)
  (__ ["a" ["b"] "c"]) => '("a" "b" "c")
  (__ '((((:a))))) => '(:a))

(def c '((1 2) 3 [4 [5 6]]))

(defn foo [x]
  (rest (tree-seq sequential? seq x)))


(defn flatty
  "Takes any nested combination of sequential things (lists, vectors,
  etc.) and returns their contents as a single, flat sequence.
  (flatten nil) returns nil."
  {:added "1.2"
   :static true}
  [x]
  (filter (complement sequential?)
          (rest (tree-seq sequential? identity x))))


(defn flat2
  "Take a sequence of arbitrary depth and flattens it"
  [s]
  (if (sequential? s)
    (mapcat flat2 s)
    (list s))) 


(defn __
  "Take a sequence of arbitrary depth and flattens it"
  [s]
  (if (sequential? s)
    (mapcat __ s)
    (list s))) 

