.class Lcom/digdroid/alman/dig/MyWidget$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MyWidget$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/MyWidget$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MyWidget$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MyWidget$a$a;->b:Lcom/digdroid/alman/dig/MyWidget$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    new-instance p1, Ljava/util/HashSet;

    iget-object p2, p0, Lcom/digdroid/alman/dig/MyWidget$a$a;->b:Lcom/digdroid/alman/dig/MyWidget$a;

    iget-object p2, p2, Lcom/digdroid/alman/dig/MyWidget$a;->c:Lcom/digdroid/alman/dig/c3;

    const-string v0, "homescreen"

    invoke-virtual {p2, v0}, Lcom/digdroid/alman/dig/c3;->r(Ljava/lang/String;)Ljava/util/Set;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/MyWidget$a$a;->b:Lcom/digdroid/alman/dig/MyWidget$a;

    iget-object v1, v1, Lcom/digdroid/alman/dig/MyWidget$a;->d:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/MyWidget$a$a;->b:Lcom/digdroid/alman/dig/MyWidget$a;

    iget-wide v1, v1, Lcom/digdroid/alman/dig/MyWidget$a;->e:J

    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lcom/digdroid/alman/dig/MyWidget$a$a;->b:Lcom/digdroid/alman/dig/MyWidget$a;

    iget-object p2, p2, Lcom/digdroid/alman/dig/MyWidget$a;->c:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {p2, v0, p1}, Lcom/digdroid/alman/dig/c3;->H(Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method
