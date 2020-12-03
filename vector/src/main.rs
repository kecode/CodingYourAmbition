fn main() {
    println!("Hello, world!");

    //let v: Vec<i32> = Vec::new();
    //let v = vec![1,2,3];
    //
    let mut v = Vec::new();
    v.push(5);
    v.push(6);
    v.push(6);
    v.push(7);

    for i in &v {
        println!("{}", i);
    }
    let third: &i32 = &v[2];
    println!("The third element is {}", third);

    match v.get(3) {
        Some(third) => println!("The third element is {}", third),
        None => println!("There is no third element."),
    }

    let mut x = vec![100,300,500];
    for i in &mut x {
        *i += 50;
        println!("{}", i);
    }

    #[derive(Debug)]
    enum SpreadsheetCell {
        Int(i32),
        Float(f64),
        Text(String),
    }

    let row = vec![
        SpreadsheetCell::Int(3),
        SpreadsheetCell::Text(String::from("blue")),
        SpreadsheetCell::Float(3.1415926),
    ];

    for i in & row {
        println!("{:#?}", i);
    }

    for i in & row {
        println!("{:?}", i)
    }
}
