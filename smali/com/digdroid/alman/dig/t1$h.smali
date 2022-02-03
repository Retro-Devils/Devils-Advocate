.class Lcom/digdroid/alman/dig/t1$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1;->b(Landroid/app/Activity;Lcom/digdroid/alman/dig/t1$i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/digdroid/alman/dig/t1$i;

.field final synthetic d:Lcom/digdroid/alman/dig/t1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;Lcom/digdroid/alman/dig/t1$i;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$h;->d:Lcom/digdroid/alman/dig/t1;

    iput-object p2, p0, Lcom/digdroid/alman/dig/t1$h;->b:Landroid/app/Activity;

    iput-object p3, p0, Lcom/digdroid/alman/dig/t1$h;->c:Lcom/digdroid/alman/dig/t1$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    new-instance p1, Lcom/digdroid/alman/dig/t1$j;

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1$h;->d:Lcom/digdroid/alman/dig/t1;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$h;->b:Landroid/app/Activity;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$h;->c:Lcom/digdroid/alman/dig/t1$i;

    invoke-direct {p1, p2, v0, v1}, Lcom/digdroid/alman/dig/t1$j;-><init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;Lcom/digdroid/alman/dig/t1$i;)V

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
