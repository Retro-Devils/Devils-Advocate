.class Lcom/digdroid/alman/dig/g3$n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/g3;->H2(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/g3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3$n;->b:Lcom/digdroid/alman/dig/g3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    new-instance p1, Lcom/digdroid/alman/dig/g3$n$a;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/g3$n$a;-><init>(Lcom/digdroid/alman/dig/g3$n;)V

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
