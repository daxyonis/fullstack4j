<template>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-12">
                Hello World  : {{msg}}
            </div>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
        msg: "",
        };
    }, 
    mounted() {
        fetch("/api/messages/hello")
        .then((response) => response.text())
        .then((data) => {
            this.msg = data;
        });
  },
};
</script>
<style>
</style>
