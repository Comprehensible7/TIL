function formCheck() {
    
    var member_id = document.getElementById('member_id').value;
    var member_pw = document.getElementById('member_pw').value;
    var member_nm = document.getElementById('member_nm').value;
    
    var member_pw_check = document.getElementById('member_pw_check').value;
    
    if(member_id == '' || member_id.length == 0){
        alert('아이디를 입력하세요.');
        return false;
        
    } else if(member_id.length < 4 || member_id.length > 10){
        alert('아이디는 4글자이상 10글자 이하로 입력해 주세요.');
        return false;
    }
    
    if(member_pw == '' || member_pw.length == 0){
        alert('비밀번호를 입력하세요.');
        return false;
        
    } else if(member_pw.length < 6 || member_pw.length > 10){
        alert('비밀번호는 6글자이상 10글자 이하로 입력해 주세요.');
    }
    
    if(member_pw != member_pw_check){
       alert('동일한 비밀번호를 입력해 주세요.');
        return false;
    }
    
    if(member_nm == '' || member_nm == 0){
       alert('이름을 입력해 주세요.');
        return false;
    }
    
    return true;
    
}