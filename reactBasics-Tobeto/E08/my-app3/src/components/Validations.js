import * as yup from "yup";

const validations = yup.object({
    
        firstName: yup.string().required("Zorunlu alan"),
        lastName: yup.string().required("Zorunlu alan"),
        email: yup.string().email("Lütfen geçerli e-posta giriniz.").required("Zorunlu alan"),
        password: yup.string().min(6, "Min 6 karakter").max(12, "Max 12 karakter").required("Zorunlu alan"),
        repassword: yup.string().min(6, "Min 6 karakter").max(12, "Max 12 karakter").required("Zorunlu alan").oneOf([yup.ref("password")], "Şifre ile şifre tekrar uyuşmuyor.")
    
});

export default validations;