$('#form').submit(async function (e) {
    e.preventDefault();
    let temp = $('#form').serialize().split("&");
    let name = temp[0].split("=");
    let age = temp[1].split("=");
    console.log(temp);
    let data ={
        id:0,
        name: name[1],
        age: age[1]*1
    }
    console.log({data},$('#form').serialize());
    const result = await axios.post("http://localhost:8989/api/cus/insertCus",data);
    console.log(result);
    // http://localhost:8989/api/cus/getId?+data
});
