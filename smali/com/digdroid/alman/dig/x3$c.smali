.class Lcom/digdroid/alman/dig/x3$c;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/x3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/x3;


# direct methods
.method private constructor <init>(Lcom/digdroid/alman/dig/x3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/x3$c;->a:Lcom/digdroid/alman/dig/x3;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/digdroid/alman/dig/x3;Lcom/digdroid/alman/dig/x3$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/x3$c;-><init>(Lcom/digdroid/alman/dig/x3;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/String;
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/x3$c;->a:Lcom/digdroid/alman/dig/x3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y3;->c(Landroid/content/Context;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/x3$c;->a([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
