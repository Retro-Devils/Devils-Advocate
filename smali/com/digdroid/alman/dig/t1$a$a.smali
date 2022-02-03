.class Lcom/digdroid/alman/dig/t1$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1$a;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/t1$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$a$a;->a:Lcom/digdroid/alman/dig/t1$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    aget-object p1, p1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$a$a;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t1$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$a$a;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/y3;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$a;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/g3;->e()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$a;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->e:Lcom/digdroid/alman/dig/t1$l;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/t1$l;->a()V

    return-void
.end method
