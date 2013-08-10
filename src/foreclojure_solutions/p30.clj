(ns foreclojure-solutions.p30
  (:use midje.sweet)
  )

(defn __ []
  "Implement me!")

(future-fact "Compress a Sequence"
  (apply str (__ "Leeeeeerrroyyy")) => "Leroy"
  (__ [1 1 2 3 3 2 2 3]) => '(1 2 3 2 3)
  (__ [[1 2] [1 2] [3 4] [1 2]]) => '([1 2] [3 4] [1 2]))


(defn comp1
  "Compresses a sequence - this never terminates"
  [s]
  (loop [x s result []]
    (if (not (= (first x) (first (rest x))))
      (concat result [(first x)]))
    (recur (flatten (concat (list (first x)) (drop 2 x))) result)
    )
  )

(defn comp2
  "Compresses a sequence"
  [s]
  (loop [x s result []]
    (let [a (first x) b (first (rest x))]
      (if (nil? b)                      ; if we're at the end of the list return
        result
        (if (not (= a b))               ; if the first and next dont match add to result
          (concat result [a])
          (recur (concat (list (first x))
                         (drop 2 x))
                 result))))))


(defn dd
  "de-dups a sequence"
  [x y]
  )

(def b '(1 1 2 3))
