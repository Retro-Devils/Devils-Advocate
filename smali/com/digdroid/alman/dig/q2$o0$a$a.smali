.class Lcom/digdroid/alman/dig/q2$o0$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2$o0$a;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/q2$o0$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2$o0$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$o0$a$a;->b:Lcom/digdroid/alman/dig/q2$o0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    new-instance p1, Lcom/digdroid/alman/dig/q2$v0;

    iget-object p2, p0, Lcom/digdroid/alman/dig/q2$o0$a$a;->b:Lcom/digdroid/alman/dig/q2$o0$a;

    iget-object p2, p2, Lcom/digdroid/alman/dig/q2$o0$a;->a:Lcom/digdroid/alman/dig/q2$o0;

    iget-object p2, p2, Lcom/digdroid/alman/dig/q2$o0;->c:Lcom/digdroid/alman/dig/q2;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lcom/digdroid/alman/dig/q2$v0;-><init>(Lcom/digdroid/alman/dig/q2;Lcom/digdroid/alman/dig/q2$k;)V

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
