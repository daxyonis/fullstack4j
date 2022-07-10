<template>
  <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-12">
                <h1>{{items.length}} item(s) disponible(s)</h1>
                <!-- <div v-if="items.length" class="row">
                  <div class="col-md-6">

                  </div>
                </div> -->
                <ul v-if="items.length">
                  <li v-for="item in items" :key="item.id">
                    {{item.name}}
                  </li>
                </ul>
            </div>
        </div>
    </div>
</template>

<script>
export default {
 data() {
        return {
        items: [],
        };
    }, 
    mounted() {
        fetch("/api/catalog/")
        .then(response => response.text())
        .then(data => {        
            console.log(data);
            this.items = JSON.parse(data);
        })
        .catch(error => {
          // handle error
        });
  },
}
</script>

<style>

</style>