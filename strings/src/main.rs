fn main() {
    println!("Hello, world!");

    let mut s = String::new();

   // let data = "initial contents";
    //let s = data.to_string();

    //let s = "initial_contents".to_string();

    //let s = String::from("initial contents");

    s.push_str("kehenghao");
    println!("s is {}", s);

    let s1 = String::from("tic");
    let s2 = String::from("tac");
    let s3 = String::from("toe");
    let s4 = format!("{}-{}-{}", s1, s2, s3);
    println!("{}", s4);


    let hello = "Здравствуйте";
    let sss = &hello[0..4];
    println!("{}", sss);

    for c in "नम􀄰ते".chars() {
        println!("{}", c);
    }


    for b in "नम􀄰ते".bytes() {
        println!("{}", b);
    }
}
