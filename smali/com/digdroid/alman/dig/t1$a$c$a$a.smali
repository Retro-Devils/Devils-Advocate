.class Lcom/digdroid/alman/dig/t1$a$c$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/h3$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1$a$c$a;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/t1$a$c$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1$a$c$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$a$c$a$a;->a:Lcom/digdroid/alman/dig/t1$a$c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a$c$a$a;->a:Lcom/digdroid/alman/dig/t1$a$c$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a$c$a;->b:Lcom/digdroid/alman/dig/t1$a$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a$c;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1;->c:Lcom/digdroid/alman/dig/c3;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/c3;->W(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a$c$a$a;->a:Lcom/digdroid/alman/dig/t1$a$c$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a$c$a;->b:Lcom/digdroid/alman/dig/t1$a$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a$c;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object v1, v0, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    invoke-virtual {v1, p1, v0}, Lcom/digdroid/alman/dig/t1;->z(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$c$a$a;->a:Lcom/digdroid/alman/dig/t1$a$c$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a$c$a;->b:Lcom/digdroid/alman/dig/t1$a$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a$c;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->c:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    return-void
.end method
